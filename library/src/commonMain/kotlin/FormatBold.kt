package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatBold: ImageVector
    get() {
        if (_FormatBold != null) {
            return _FormatBold!!
        }
        _FormatBold = ImageVector.Builder(
            name = "FormatBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 15.5f)
                horizontalLineTo(10f)
                verticalLineTo(12.5f)
                horizontalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 15.5f)
                moveTo(10f, 6.5f)
                horizontalLineTo(13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 9.5f)
                horizontalLineTo(10f)
                moveTo(15.6f, 10.79f)
                curveTo(16.57f, 10.11f, 17.25f, 9f, 17.25f, 8f)
                curveTo(17.25f, 5.74f, 15.5f, 4f, 13.25f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(14.04f)
                curveTo(16.14f, 18f, 17.75f, 16.3f, 17.75f, 14.21f)
                curveTo(17.75f, 12.69f, 16.89f, 11.39f, 15.6f, 10.79f)
                close()
            }
        }.build()

        return _FormatBold!!
    }

@Suppress("ObjectPropertyName")
private var _FormatBold: ImageVector? = null

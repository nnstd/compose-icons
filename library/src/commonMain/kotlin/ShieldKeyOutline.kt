package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldKeyOutline: ImageVector
    get() {
        if (_ShieldKeyOutline != null) {
            return _ShieldKeyOutline!!
        }
        _ShieldKeyOutline = ImageVector.Builder(
            name = "ShieldKeyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                moveTo(12f, 21f)
                curveTo(15.75f, 20f, 19f, 15.54f, 19f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5f, 15.54f, 8.25f, 20f, 12f, 21f)
                moveTo(12f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 9f)
                curveTo(15f, 10.31f, 14.17f, 11.42f, 13f, 11.83f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(11.83f)
                curveTo(9.83f, 11.42f, 9f, 10.31f, 9f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                moveTo(12f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                close()
            }
        }.build()

        return _ShieldKeyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldKeyOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneIncoming: ImageVector
    get() {
        if (_PhoneIncoming != null) {
            return _PhoneIncoming!!
        }
        _PhoneIncoming = ImageVector.Builder(
            name = "PhoneIncoming",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                verticalLineTo(16.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.9f, 15.41f, 15.17f)
                lineTo(13.21f, 17.37f)
                curveTo(10.38f, 15.93f, 8.06f, 13.62f, 6.62f, 10.78f)
                lineTo(8.82f, 8.57f)
                curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 3f)
                horizontalLineTo(4f)
                moveTo(19f, 11f)
                verticalLineTo(9.5f)
                horizontalLineTo(15.5f)
                lineTo(21f, 4f)
                lineTo(20f, 3f)
                lineTo(14.5f, 8.5f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _PhoneIncoming!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneIncoming: ImageVector? = null

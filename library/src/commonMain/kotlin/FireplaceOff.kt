package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FireplaceOff: ImageVector
    get() {
        if (_FireplaceOff != null) {
            return _FireplaceOff!!
        }
        _FireplaceOff = ImageVector.Builder(
            name = "FireplaceOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(22f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                moveTo(20f, 7f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                curveTo(17f, 11f, 14.5f, 10f, 12f, 10f)
                curveTo(9.5f, 10f, 7f, 11f, 7f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _FireplaceOff!!
    }

@Suppress("ObjectPropertyName")
private var _FireplaceOff: ImageVector? = null

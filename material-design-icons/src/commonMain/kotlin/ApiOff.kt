package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApiOff: ImageVector
    get() {
        if (_ApiOff != null) {
            return _ApiOff!!
        }
        _ApiOff = ImageVector.Builder(
            name = "ApiOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                moveTo(14f, 7f)
                horizontalLineTo(11.38f)
                lineTo(13.29f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(9.75f)
                lineTo(15.87f, 11.71f)
                curveTo(15.95f, 11.5f, 16f, 11.25f, 16f, 11f)
                verticalLineTo(9f)
                curveTo(16f, 7.9f, 15.11f, 7f, 14f, 7f)
                moveTo(4.45f, 2.62f)
                lineTo(3f, 4f)
                lineTo(5.86f, 7f)
                horizontalLineTo(5f)
                curveTo(3.9f, 7f, 3f, 7.9f, 3f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(10.3f)
                lineTo(10f, 11.34f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(13.45f)
                lineTo(19.55f, 21.38f)
                lineTo(21f, 20f)
                moveTo(20.9f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(13.95f)
                close()
            }
        }.build()

        return _ApiOff!!
    }

@Suppress("ObjectPropertyName")
private var _ApiOff: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkateOff: ImageVector
    get() {
        if (_SkateOff != null) {
            return _SkateOff!!
        }
        _SkateOff = ImageVector.Builder(
            name = "SkateOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15.81f)
                lineTo(13.36f, 10.16f)
                curveTo(15.22f, 10.62f, 17.63f, 11.05f, 18.53f, 12.95f)
                curveTo(18.95f, 13.57f, 19f, 14.71f, 19f, 15.81f)
                moveTo(20.95f, 17f)
                curveTo(20.92f, 17.21f, 20.87f, 17.41f, 20.8f, 17.6f)
                lineTo(22.32f, 19.12f)
                curveTo(22.68f, 18.5f, 22.92f, 17.77f, 23f, 17f)
                horizontalLineTo(20.95f)
                moveTo(10.5f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                lineTo(10.2f, 7f)
                horizontalLineTo(10.5f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.66f, 21.55f)
                curveTo(19f, 21.83f, 18.27f, 22f, 17.5f, 22f)
                horizontalLineTo(1f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(2.03f)
                verticalLineTo(3.92f)
                lineTo(1.11f, 3f)
                lineTo(2.03f, 2.09f)
                verticalLineTo(2f)
                horizontalLineTo(2.12f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(14f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                moveTo(18.06f, 19.95f)
                lineTo(16.11f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(17.5f)
                curveTo(17.69f, 20f, 17.88f, 20f, 18.06f, 19.95f)
                moveTo(10.5f, 5f)
                verticalLineTo(2f)
                horizontalLineTo(5.2f)
                lineTo(8.2f, 5f)
                horizontalLineTo(10.5f)
                close()
            }
        }.build()

        return _SkateOff!!
    }

@Suppress("ObjectPropertyName")
private var _SkateOff: ImageVector? = null

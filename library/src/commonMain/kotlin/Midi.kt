package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Midi: ImageVector
    get() {
        if (_Midi != null) {
            return _Midi!!
        }
        _Midi = ImageVector.Builder(
            name = "Midi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.15f, 8.26f)
                horizontalLineTo(22f)
                verticalLineTo(15.74f)
                horizontalLineTo(20.15f)
                moveTo(13f, 8.26f)
                horizontalLineTo(18.43f)
                curveTo(19f, 8.26f, 19.3f, 8.74f, 19.3f, 9.3f)
                verticalLineTo(14.81f)
                curveTo(19.3f, 15.5f, 19f, 15.74f, 18.38f, 15.74f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(14.87f)
                verticalLineTo(13.91f)
                horizontalLineTo(17.5f)
                verticalLineTo(9.95f)
                horizontalLineTo(13f)
                moveTo(10.32f, 8.26f)
                horizontalLineTo(12.14f)
                verticalLineTo(15.74f)
                horizontalLineTo(10.32f)
                moveTo(2f, 8.26f)
                horizontalLineTo(8.55f)
                curveTo(9.1f, 8.26f, 9.41f, 8.74f, 9.41f, 9.3f)
                verticalLineTo(15.74f)
                horizontalLineTo(7.59f)
                verticalLineTo(10.15f)
                horizontalLineTo(6.5f)
                verticalLineTo(15.74f)
                horizontalLineTo(4.87f)
                verticalLineTo(10.15f)
                horizontalLineTo(3.83f)
                verticalLineTo(15.74f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _Midi!!
    }

@Suppress("ObjectPropertyName")
private var _Midi: ImageVector? = null

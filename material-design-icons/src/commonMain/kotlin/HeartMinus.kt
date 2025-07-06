package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartMinus: ImageVector
    get() {
        if (_HeartMinus != null) {
            return _HeartMinus!!
        }
        _HeartMinus = ImageVector.Builder(
            name = "HeartMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveTo(12f, 19f, 12.25f, 19.92f, 12.67f, 20.74f)
                lineTo(12f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2f, 12.27f, 2f, 8.5f)
                curveTo(2f, 5.41f, 4.42f, 3f, 7.5f, 3f)
                curveTo(9.24f, 3f, 10.91f, 3.81f, 12f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3f, 16.5f, 3f)
                curveTo(19.58f, 3f, 22f, 5.41f, 22f, 8.5f)
                curveTo(22f, 9.93f, 21.5f, 11.26f, 20.62f, 12.61f)
                curveTo(19.83f, 12.23f, 18.94f, 12f, 18f, 12f)
                curveTo(14.69f, 12f, 12f, 14.69f, 12f, 18f)
                moveTo(14f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _HeartMinus!!
    }

@Suppress("ObjectPropertyName")
private var _HeartMinus: ImageVector? = null

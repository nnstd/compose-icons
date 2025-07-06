package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AutoMode: ImageVector
    get() {
        if (_AutoMode != null) {
            return _AutoMode!!
        }
        _AutoMode = ImageVector.Builder(
            name = "AutoMode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.8f, 5.67f)
                curveTo(21.05f, 7.19f, 21.82f, 9.04f, 22f, 11f)
                horizontalLineTo(19.94f)
                curveTo(19.74f, 9.57f, 19.16f, 8.22f, 18.26f, 7.1f)
                lineTo(19.8f, 5.67f)
                moveTo(13f, 2.05f)
                curveTo(14.96f, 2.24f, 16.81f, 3f, 18.33f, 4.26f)
                lineTo(16.9f, 5.69f)
                curveTo(15.77f, 4.8f, 14.42f, 4.24f, 13f, 4.05f)
                verticalLineTo(2.05f)
                moveTo(11f, 2.06f)
                curveTo(9.04f, 2.26f, 7.19f, 3.03f, 5.67f, 4.27f)
                lineTo(7.1f, 5.69f)
                curveTo(8.23f, 4.81f, 9.58f, 4.24f, 11f, 4.06f)
                verticalLineTo(2.06f)
                moveTo(4.26f, 5.67f)
                lineTo(5.63f, 7.06f)
                verticalLineTo(7.1f)
                curveTo(4.75f, 8.23f, 4.18f, 9.58f, 4f, 11f)
                horizontalLineTo(2f)
                curveTo(2.21f, 9.04f, 3f, 7.18f, 4.26f, 5.67f)
                moveTo(2f, 14f)
                verticalLineTo(19f)
                lineTo(3.6f, 17.4f)
                curveTo(5.38f, 20.17f, 8.47f, 22f, 12f, 22f)
                curveTo(16.82f, 22f, 20.87f, 18.55f, 21.8f, 14f)
                horizontalLineTo(19.75f)
                curveTo(18.86f, 17.45f, 15.72f, 20f, 12f, 20f)
                curveTo(9.05f, 20f, 6.39f, 18.39f, 5f, 16f)
                lineTo(7f, 14f)
                horizontalLineTo(2f)
                moveTo(12f, 17f)
                lineTo(13.56f, 13.58f)
                lineTo(17f, 12f)
                lineTo(13.56f, 10.44f)
                lineTo(12f, 7f)
                lineTo(10.43f, 10.44f)
                lineTo(7f, 12f)
                lineTo(10.43f, 13.58f)
                lineTo(12f, 17f)
                close()
            }
        }.build()

        return _AutoMode!!
    }

@Suppress("ObjectPropertyName")
private var _AutoMode: ImageVector? = null

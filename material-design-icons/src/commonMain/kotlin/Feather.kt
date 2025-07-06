package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Feather: ImageVector
    get() {
        if (_Feather != null) {
            return _Feather!!
        }
        _Feather = ImageVector.Builder(
            name = "Feather",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                curveTo(22f, 2f, 14.36f, 1.63f, 8.34f, 9.88f)
                curveTo(3.72f, 16.21f, 2f, 22f, 2f, 22f)
                lineTo(3.94f, 21f)
                curveTo(5.38f, 18.5f, 6.13f, 17.47f, 7.54f, 16f)
                curveTo(10.07f, 16.74f, 12.71f, 16.65f, 15f, 14f)
                curveTo(13f, 13.44f, 11.4f, 13.57f, 9.04f, 13.81f)
                curveTo(11.69f, 12f, 13.5f, 11.6f, 16f, 12f)
                lineTo(17f, 10f)
                curveTo(15.2f, 9.66f, 14f, 9.63f, 12.22f, 10.04f)
                curveTo(14.19f, 8.65f, 15.56f, 7.87f, 18f, 8f)
                lineTo(19.21f, 6.07f)
                curveTo(17.65f, 5.96f, 16.71f, 6.13f, 14.92f, 6.57f)
                curveTo(16.53f, 5.11f, 18f, 4.45f, 20.14f, 4.32f)
                curveTo(20.14f, 4.32f, 21.19f, 2.43f, 22f, 2f)
                close()
            }
        }.build()

        return _Feather!!
    }

@Suppress("ObjectPropertyName")
private var _Feather: ImageVector? = null

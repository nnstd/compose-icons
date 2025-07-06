package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Volleyball: ImageVector
    get() {
        if (_Volleyball != null) {
            return _Volleyball!!
        }
        _Volleyball = ImageVector.Builder(
            name = "Volleyball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.04f, 4.85f)
                curveTo(17.34f, 3.2f, 15.33f, 2.25f, 13f, 2f)
                verticalLineTo(5.62f)
                lineTo(22f, 10.8f)
                curveTo(21.72f, 8.5f, 20.73f, 6.5f, 19.04f, 4.85f)
                moveTo(12f, 22f)
                curveTo(15.44f, 22f, 18.16f, 20.62f, 20.17f, 17.86f)
                lineTo(17.06f, 16f)
                lineTo(8.07f, 21.2f)
                curveTo(9.32f, 21.73f, 10.64f, 22f, 12f, 22f)
                moveTo(13f, 11.41f)
                lineTo(21.15f, 16.07f)
                curveTo(21.59f, 15.13f, 21.88f, 14.14f, 22f, 13.11f)
                lineTo(13f, 7.93f)
                verticalLineTo(11.41f)
                moveTo(3.88f, 17.81f)
                curveTo(4.54f, 18.72f, 5.26f, 19.46f, 6.05f, 20f)
                lineTo(15.04f, 14.9f)
                lineTo(12f, 13.15f)
                lineTo(3.88f, 17.81f)
                moveTo(11.04f, 2f)
                curveTo(10f, 2.09f, 9f, 2.36f, 8f, 2.8f)
                verticalLineTo(13.15f)
                lineTo(11.04f, 11.41f)
                verticalLineTo(2f)
                moveTo(2f, 12f)
                curveTo(2f, 13.39f, 2.3f, 14.77f, 2.89f, 16.12f)
                lineTo(6f, 14.28f)
                verticalLineTo(4f)
                curveTo(3.33f, 6f, 2f, 8.65f, 2f, 12f)
                close()
            }
        }.build()

        return _Volleyball!!
    }

@Suppress("ObjectPropertyName")
private var _Volleyball: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Draw: ImageVector
    get() {
        if (_Draw != null) {
            return _Draw!!
        }
        _Draw = ImageVector.Builder(
            name = "Draw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.75f, 20.85f)
                curveTo(11.53f, 20.15f, 11.14f, 18.22f, 10.24f, 17f)
                curveTo(9.35f, 15.75f, 8.12f, 14.89f, 6.88f, 14.06f)
                curveTo(6f, 13.5f, 5.19f, 12.8f, 4.54f, 12f)
                curveTo(4.26f, 11.67f, 3.69f, 11.06f, 4.27f, 10.94f)
                curveTo(4.86f, 10.82f, 5.88f, 11.4f, 6.4f, 11.62f)
                curveTo(7.31f, 12f, 8.21f, 12.44f, 9.05f, 12.96f)
                lineTo(10.06f, 11.26f)
                curveTo(8.5f, 10.23f, 6.5f, 9.32f, 4.64f, 9.05f)
                curveTo(3.58f, 8.89f, 2.46f, 9.11f, 2.1f, 10.26f)
                curveTo(1.78f, 11.25f, 2.29f, 12.25f, 2.87f, 13.03f)
                curveTo(4.24f, 14.86f, 6.37f, 15.74f, 7.96f, 17.32f)
                curveTo(8.3f, 17.65f, 8.71f, 18.04f, 8.91f, 18.5f)
                curveTo(9.12f, 18.94f, 9.07f, 18.97f, 8.6f, 18.97f)
                curveTo(7.36f, 18.97f, 5.81f, 18f, 4.8f, 17.36f)
                lineTo(3.79f, 19.06f)
                curveTo(5.32f, 20f, 7.88f, 21.47f, 9.75f, 20.85f)
                moveTo(20.84f, 5.25f)
                curveTo(21.06f, 5.03f, 21.06f, 4.67f, 20.84f, 4.46f)
                lineTo(19.54f, 3.16f)
                curveTo(19.33f, 2.95f, 18.97f, 2.95f, 18.76f, 3.16f)
                lineTo(17.74f, 4.18f)
                lineTo(19.82f, 6.26f)
                moveTo(11f, 10.92f)
                verticalLineTo(13f)
                horizontalLineTo(13.08f)
                lineTo(19.23f, 6.85f)
                lineTo(17.15f, 4.77f)
                lineTo(11f, 10.92f)
                close()
            }
        }.build()

        return _Draw!!
    }

@Suppress("ObjectPropertyName")
private var _Draw: ImageVector? = null

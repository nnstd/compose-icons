package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dolly: ImageVector
    get() {
        if (_Dolly != null) {
            return _Dolly!!
        }
        _Dolly = ImageVector.Builder(
            name = "Dolly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.97f, 19.88f)
                curveTo(10.93f, 20.26f, 9.78f, 19.72f, 9.4f, 18.69f)
                curveTo(9f, 17.65f, 9.55f, 16.5f, 10.59f, 16.13f)
                curveTo(11.63f, 15.75f, 12.78f, 16.28f, 13.16f, 17.31f)
                curveTo(13.54f, 18.35f, 13f, 19.5f, 11.97f, 19.88f)
                moveTo(9.9f, 14.25f)
                curveTo(7.83f, 15f, 6.76f, 17.3f, 7.5f, 19.38f)
                curveTo(8.28f, 21.45f, 10.58f, 22.5f, 12.66f, 21.75f)
                curveTo(14.73f, 21f, 15.79f, 18.7f, 15.04f, 16.63f)
                curveTo(14.28f, 14.55f, 11.97f, 13.5f, 9.9f, 14.25f)
                moveTo(15.94f, 4.58f)
                lineTo(9.37f, 7f)
                lineTo(10.75f, 10.74f)
                lineTo(17.32f, 8.33f)
                moveTo(20.32f, 13.62f)
                lineTo(15.54f, 15.37f)
                curveTo(15.71f, 15.66f, 15.85f, 15.96f, 15.97f, 16.28f)
                curveTo(16.09f, 16.6f, 16.17f, 16.93f, 16.22f, 17.25f)
                lineTo(21f, 15.5f)
                moveTo(19.54f, 8.58f)
                lineTo(11.09f, 11.68f)
                lineTo(11.58f, 13f)
                curveTo(12.83f, 13.09f, 14f, 13.64f, 14.89f, 14.55f)
                lineTo(20.92f, 12.34f)
                moveTo(2f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(5.09f)
                lineTo(8.66f, 13.75f)
                curveTo(8.94f, 13.57f, 9.24f, 13.43f, 9.56f, 13.31f)
                curveTo(9.88f, 13.19f, 10.21f, 13.11f, 10.53f, 13.06f)
                lineTo(6.5f, 2f)
            }
        }.build()

        return _Dolly!!
    }

@Suppress("ObjectPropertyName")
private var _Dolly: ImageVector? = null

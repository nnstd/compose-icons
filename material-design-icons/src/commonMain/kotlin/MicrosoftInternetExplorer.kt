package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftInternetExplorer: ImageVector
    get() {
        if (_MicrosoftInternetExplorer != null) {
            return _MicrosoftInternetExplorer!!
        }
        _MicrosoftInternetExplorer = ImageVector.Builder(
            name = "MicrosoftInternetExplorer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                lineTo(14f, 3.06f)
                curveTo(16.8f, 1.79f, 19.23f, 1.64f, 20.5f, 2.92f)
                curveTo(21.5f, 3.93f, 21.58f, 5.67f, 20.92f, 7.72f)
                curveTo(21.61f, 9f, 22f, 10.45f, 22f, 12f)
                lineTo(21.95f, 13f)
                horizontalLineTo(9.08f)
                curveTo(9.45f, 15.28f, 11.06f, 17f, 13f, 17f)
                curveTo(14.31f, 17f, 15.47f, 16.21f, 16.2f, 15f)
                horizontalLineTo(21.5f)
                curveTo(20.25f, 18.5f, 16.92f, 21f, 13f, 21f)
                curveTo(11.72f, 21f, 10.5f, 20.73f, 9.41f, 20.25f)
                curveTo(6.5f, 21.68f, 3.89f, 21.9f, 2.57f, 20.56f)
                curveTo(1f, 18.96f, 1.68f, 15.57f, 4f, 12f)
                curveTo(4.93f, 10.54f, 6.14f, 9.06f, 7.57f, 7.65f)
                lineTo(8.38f, 6.88f)
                curveTo(7.21f, 7.57f, 5.71f, 8.62f, 4.19f, 10.17f)
                curveTo(5.03f, 6.08f, 8.66f, 3f, 13f, 3f)
                moveTo(13f, 7f)
                curveTo(11.21f, 7f, 9.69f, 8.47f, 9.18f, 10.5f)
                horizontalLineTo(16.82f)
                curveTo(16.31f, 8.47f, 14.79f, 7f, 13f, 7f)
                moveTo(20.06f, 4.06f)
                curveTo(19.4f, 3.39f, 18.22f, 3.35f, 16.74f, 3.81f)
                curveTo(18.22f, 4.5f, 19.5f, 5.56f, 20.41f, 6.89f)
                curveTo(20.73f, 5.65f, 20.64f, 4.65f, 20.06f, 4.06f)
                moveTo(3.89f, 20f)
                curveTo(4.72f, 20.84f, 6.4f, 20.69f, 8.44f, 19.76f)
                curveTo(6.59f, 18.67f, 5.17f, 16.94f, 4.47f, 14.88f)
                curveTo(3.27f, 17.15f, 3f, 19.07f, 3.89f, 20f)
                close()
            }
        }.build()

        return _MicrosoftInternetExplorer!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftInternetExplorer: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Twitter: ImageVector
    get() {
        if (_Twitter != null) {
            return _Twitter!!
        }
        _Twitter = ImageVector.Builder(
            name = "Twitter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.46f, 6f)
                curveTo(21.69f, 6.35f, 20.86f, 6.58f, 20f, 6.69f)
                curveTo(20.88f, 6.16f, 21.56f, 5.32f, 21.88f, 4.31f)
                curveTo(21.05f, 4.81f, 20.13f, 5.16f, 19.16f, 5.36f)
                curveTo(18.37f, 4.5f, 17.26f, 4f, 16f, 4f)
                curveTo(13.65f, 4f, 11.73f, 5.92f, 11.73f, 8.29f)
                curveTo(11.73f, 8.63f, 11.77f, 8.96f, 11.84f, 9.27f)
                curveTo(8.28f, 9.09f, 5.11f, 7.38f, 3f, 4.79f)
                curveTo(2.63f, 5.42f, 2.42f, 6.16f, 2.42f, 6.94f)
                curveTo(2.42f, 8.43f, 3.17f, 9.75f, 4.33f, 10.5f)
                curveTo(3.62f, 10.5f, 2.96f, 10.3f, 2.38f, 10f)
                curveTo(2.38f, 10f, 2.38f, 10f, 2.38f, 10.03f)
                curveTo(2.38f, 12.11f, 3.86f, 13.85f, 5.82f, 14.24f)
                curveTo(5.46f, 14.34f, 5.08f, 14.39f, 4.69f, 14.39f)
                curveTo(4.42f, 14.39f, 4.15f, 14.36f, 3.89f, 14.31f)
                curveTo(4.43f, 16f, 6f, 17.26f, 7.89f, 17.29f)
                curveTo(6.43f, 18.45f, 4.58f, 19.13f, 2.56f, 19.13f)
                curveTo(2.22f, 19.13f, 1.88f, 19.11f, 1.54f, 19.07f)
                curveTo(3.44f, 20.29f, 5.7f, 21f, 8.12f, 21f)
                curveTo(16f, 21f, 20.33f, 14.46f, 20.33f, 8.79f)
                curveTo(20.33f, 8.6f, 20.33f, 8.42f, 20.32f, 8.23f)
                curveTo(21.16f, 7.63f, 21.88f, 6.87f, 22.46f, 6f)
                close()
            }
        }.build()

        return _Twitter!!
    }

@Suppress("ObjectPropertyName")
private var _Twitter: ImageVector? = null

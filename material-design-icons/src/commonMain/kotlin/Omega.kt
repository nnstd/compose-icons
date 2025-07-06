package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Omega: ImageVector
    get() {
        if (_Omega != null) {
            return _Omega!!
        }
        _Omega = ImageVector.Builder(
            name = "Omega",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.15f, 19f)
                horizontalLineTo(13.39f)
                verticalLineTo(16.87f)
                curveTo(15.5f, 15.25f, 16.59f, 13.24f, 16.59f, 10.84f)
                curveTo(16.59f, 9.34f, 16.16f, 8.16f, 15.32f, 7.29f)
                curveTo(14.47f, 6.42f, 13.37f, 6f, 12.03f, 6f)
                curveTo(10.68f, 6f, 9.57f, 6.42f, 8.71f, 7.3f)
                curveTo(7.84f, 8.17f, 7.41f, 9.37f, 7.41f, 10.88f)
                curveTo(7.41f, 13.26f, 8.5f, 15.26f, 10.61f, 16.87f)
                verticalLineTo(19f)
                horizontalLineTo(4.85f)
                verticalLineTo(16.87f)
                horizontalLineTo(8.41f)
                curveTo(6.04f, 15.32f, 4.85f, 13.23f, 4.85f, 10.6f)
                curveTo(4.85f, 8.5f, 5.5f, 6.86f, 6.81f, 5.66f)
                curveTo(8.12f, 4.45f, 9.84f, 3.85f, 11.97f, 3.85f)
                curveTo(14.15f, 3.85f, 15.89f, 4.45f, 17.19f, 5.64f)
                curveTo(18.5f, 6.83f, 19.15f, 8.5f, 19.15f, 10.58f)
                curveTo(19.15f, 13.21f, 17.95f, 15.31f, 15.55f, 16.87f)
                horizontalLineTo(19.15f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Omega!!
    }

@Suppress("ObjectPropertyName")
private var _Omega: ImageVector? = null

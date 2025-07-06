package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cannabis: ImageVector
    get() {
        if (_Cannabis != null) {
            return _Cannabis!!
        }
        _Cannabis = ImageVector.Builder(
            name = "Cannabis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 22f)
                verticalLineTo(17.35f)
                curveTo(11f, 18.13f, 10f, 19.09f, 8.03f, 19.81f)
                curveTo(8.03f, 19.81f, 8.53f, 18.1f, 9.94f, 16.95f)
                curveTo(8.64f, 17.23f, 6.68f, 17.19f, 4f, 16f)
                curveTo(4f, 16f, 6.47f, 14.59f, 9.28f, 14.97f)
                curveTo(7.69f, 14f, 5.7f, 12.08f, 4.17f, 8.11f)
                curveTo(4.17f, 8.11f, 8.67f, 9.34f, 10.91f, 13.14f)
                curveTo(8.88f, 8.24f, 12f, 2f, 12f, 2f)
                curveTo(14.43f, 7.47f, 13.91f, 11.1f, 13.12f, 13.1f)
                curveTo(15.37f, 9.33f, 19.83f, 8.11f, 19.83f, 8.11f)
                curveTo(18.3f, 12.08f, 16.31f, 14f, 14.72f, 14.97f)
                curveTo(17.53f, 14.59f, 20f, 16f, 20f, 16f)
                curveTo(17.32f, 17.19f, 15.36f, 17.23f, 14.06f, 16.95f)
                curveTo(15.47f, 18.1f, 15.97f, 19.81f, 15.97f, 19.81f)
                curveTo(14f, 19.09f, 13f, 18.13f, 12.5f, 17.35f)
                verticalLineTo(22f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()

        return _Cannabis!!
    }

@Suppress("ObjectPropertyName")
private var _Cannabis: ImageVector? = null

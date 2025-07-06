package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fishbowl: ImageVector
    get() {
        if (_Fishbowl != null) {
            return _Fishbowl!!
        }
        _Fishbowl = ImageVector.Builder(
            name = "Fishbowl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.11f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(4.89f)
                curveTo(3.11f, 6.8f, 2f, 9.27f, 2f, 12f)
                curveTo(2f, 15.97f, 4.31f, 19.39f, 7.66f, 21f)
                horizontalLineTo(16.34f)
                curveTo(19.69f, 19.39f, 22f, 15.97f, 22f, 12f)
                curveTo(22f, 9.27f, 20.89f, 6.8f, 19.11f, 5f)
                moveTo(13.25f, 17f)
                curveTo(12.09f, 17f, 11.06f, 16.64f, 10.33f, 16.17f)
                curveTo(9.67f, 17f, 8.33f, 17f, 7f, 17f)
                curveTo(8.1f, 17f, 8.5f, 15.88f, 8.5f, 14.5f)
                curveTo(8.5f, 13.12f, 8.1f, 12f, 7f, 12f)
                curveTo(8.33f, 12f, 9.67f, 12f, 10.37f, 12.91f)
                curveTo(11.06f, 12.36f, 12.09f, 12f, 13.25f, 12f)
                curveTo(15.32f, 12f, 17f, 13.12f, 17f, 14.5f)
                curveTo(17f, 15.88f, 15.32f, 17f, 13.25f, 17f)
                moveTo(16f, 7f)
                curveTo(13.56f, 8.71f, 10.44f, 8.71f, 8f, 7f)
                curveTo(7.06f, 7.66f, 6f, 8.09f, 4.95f, 8.25f)
                curveTo(5.31f, 7.58f, 5.77f, 6.96f, 6.32f, 6.41f)
                lineTo(7.7f, 5f)
                horizontalLineTo(16.3f)
                lineTo(17.68f, 6.41f)
                curveTo(18.23f, 6.96f, 18.69f, 7.58f, 19.05f, 8.25f)
                curveTo(18f, 8.09f, 16.94f, 7.66f, 16f, 7f)
                close()
            }
        }.build()

        return _Fishbowl!!
    }

@Suppress("ObjectPropertyName")
private var _Fishbowl: ImageVector? = null

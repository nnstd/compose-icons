package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LanguageR: ImageVector
    get() {
        if (_LanguageR != null) {
            return _LanguageR!!
        }
        _LanguageR = ImageVector.Builder(
            name = "LanguageR",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.29f)
                curveTo(6.5f, 4.29f, 2f, 7.29f, 2f, 11f)
                curveTo(2f, 14.28f, 5.56f, 17f, 10.24f, 17.58f)
                verticalLineTo(19.71f)
                horizontalLineTo(13.65f)
                verticalLineTo(17.59f)
                curveTo(14.5f, 17.5f, 15.29f, 17.34f, 16.04f, 17.11f)
                lineTo(17.42f, 19.71f)
                horizontalLineTo(21.28f)
                lineTo(18.96f, 15.8f)
                curveTo(20.83f, 14.58f, 22f, 12.87f, 22f, 11f)
                curveTo(22f, 7.29f, 17.5f, 4.29f, 12f, 4.29f)
                verticalLineTo(4.29f)
                moveTo(13.53f, 6.91f)
                curveTo(17.73f, 6.91f, 20.83f, 8.31f, 20.83f, 11.5f)
                curveTo(20.83f, 13.21f, 19.91f, 14.41f, 18.41f, 15.15f)
                curveTo(18.32f, 15.1f, 18.24f, 15.05f, 18.19f, 15f)
                curveTo(17.83f, 14.84f, 17.23f, 14.66f, 17.23f, 14.66f)
                curveTo(17.23f, 14.66f, 20.21f, 14.44f, 20.21f, 11.47f)
                curveTo(20.21f, 8.5f, 17.09f, 8.45f, 17.09f, 8.45f)
                horizontalLineTo(10.24f)
                verticalLineTo(15.61f)
                curveTo(7.69f, 14.87f, 5.93f, 13.3f, 5.93f, 11.5f)
                curveTo(5.93f, 8.96f, 9.33f, 6.91f, 13.53f, 6.91f)
                moveTo(13.68f, 10.89f)
                horizontalLineTo(15.75f)
                curveTo(15.75f, 10.89f, 16.7f, 10.84f, 16.7f, 11.83f)
                curveTo(16.7f, 12.8f, 15.75f, 12.8f, 15.75f, 12.8f)
                horizontalLineTo(13.68f)
                verticalLineTo(10.89f)
                moveTo(13.65f, 15.3f)
                horizontalLineTo(14.57f)
                curveTo(14.75f, 15.3f, 14.84f, 15.35f, 15f, 15.5f)
                curveTo(15.13f, 15.6f, 15.27f, 15.79f, 15.39f, 15.96f)
                curveTo(14.84f, 16.03f, 14.26f, 16.06f, 13.65f, 16.06f)
                verticalLineTo(15.3f)
                close()
            }
        }.build()

        return _LanguageR!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageR: ImageVector? = null

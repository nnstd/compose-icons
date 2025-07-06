package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SyllabaryHiragana: ImageVector
    get() {
        if (_SyllabaryHiragana != null) {
            return _SyllabaryHiragana!!
        }
        _SyllabaryHiragana = ImageVector.Builder(
            name = "SyllabaryHiragana",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                curveTo(6.25f, 10f, 4f, 12.27f, 4f, 15.03f)
                curveTo(4f, 17.8f, 6.26f, 20.06f, 9.03f, 20.06f)
                curveTo(9.89f, 20.06f, 10.72f, 19.77f, 11.4f, 19.26f)
                curveTo(11.63f, 19.54f, 11.88f, 19.82f, 12.15f, 20.09f)
                lineTo(13.56f, 18.67f)
                curveTo(13.3f, 18.42f, 13.07f, 18.15f, 12.86f, 17.89f)
                lineTo(13.86f, 16.89f)
                curveTo(14.93f, 15.82f, 15.78f, 14.23f, 16.42f, 12.59f)
                curveTo(17.31f, 13.11f, 18f, 13.9f, 18f, 15f)
                curveTo(18f, 16.32f, 17.47f, 17.6f, 16.54f, 18.54f)
                lineTo(17.95f, 19.95f)
                curveTo(19.26f, 18.64f, 20f, 16.86f, 20f, 15f)
                curveTo(20f, 13.04f, 18.82f, 11.36f, 17.15f, 10.55f)
                lineTo(17.5f, 9.29f)
                lineTo(15.55f, 8.78f)
                lineTo(15.21f, 10.05f)
                curveTo(15.13f, 10.05f, 15.06f, 10f, 14.97f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                moveTo(11f, 12f)
                horizontalLineTo(14.5f)
                curveTo(13.94f, 13.37f, 13.19f, 14.72f, 12.44f, 15.47f)
                lineTo(11.79f, 16.13f)
                curveTo(11.25f, 14.93f, 11f, 13.59f, 11f, 12f)
                moveTo(9f, 12f)
                curveTo(9f, 14.07f, 9.41f, 15.94f, 10.3f, 17.59f)
                curveTo(9.94f, 17.89f, 9.5f, 18.06f, 9.03f, 18.06f)
                curveTo(7.33f, 18.06f, 6f, 16.73f, 6f, 15.03f)
                curveTo(6f, 13.34f, 7.32f, 12f, 9f, 12f)
                close()
            }
        }.build()

        return _SyllabaryHiragana!!
    }

@Suppress("ObjectPropertyName")
private var _SyllabaryHiragana: ImageVector? = null

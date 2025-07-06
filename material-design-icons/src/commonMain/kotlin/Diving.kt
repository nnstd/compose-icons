package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Diving: ImageVector
    get() {
        if (_Diving != null) {
            return _Diving!!
        }
        _Diving = ImageVector.Builder(
            name = "Diving",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.26f, 5.2f)
                lineTo(13.3f, 5.18f)
                curveTo(13.72f, 4.82f, 14.35f, 4.88f, 14.71f, 5.3f)
                lineTo(16.97f, 8f)
                horizontalLineTo(20f)
                curveTo(20.55f, 8f, 21f, 8.45f, 21f, 9f)
                reflectiveCurveTo(20.55f, 10f, 20f, 10f)
                horizontalLineTo(16.5f)
                curveTo(16.15f, 10f, 15.85f, 9.82f, 15.67f, 9.56f)
                lineTo(14.17f, 7.77f)
                lineTo(11.64f, 10.13f)
                lineTo(14.57f, 12.18f)
                curveTo(14.83f, 12.36f, 15f, 12.66f, 15f, 13f)
                verticalLineTo(17f)
                curveTo(15f, 17.55f, 14.55f, 18f, 14f, 18f)
                reflectiveCurveTo(13f, 17.55f, 13f, 17f)
                verticalLineTo(13.5f)
                lineTo(9.77f, 11.26f)
                curveTo(8.82f, 10.6f, 8.74f, 9.23f, 9.6f, 8.46f)
                lineTo(13.26f, 5.2f)
                moveTo(16.5f, 5f)
                curveTo(17.34f, 5f, 18f, 4.33f, 18f, 3.5f)
                reflectiveCurveTo(17.34f, 2f, 16.5f, 2f)
                reflectiveCurveTo(15f, 2.67f, 15f, 3.5f)
                reflectiveCurveTo(15.68f, 5f, 16.5f, 5f)
                moveTo(6f, 19f)
                horizontalLineTo(5f)
                curveTo(3.34f, 19f, 2f, 20.34f, 2f, 22f)
                horizontalLineTo(6f)
                verticalLineTo(20.5f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Diving!!
    }

@Suppress("ObjectPropertyName")
private var _Diving: ImageVector? = null

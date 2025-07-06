package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Menorah: ImageVector
    get() {
        if (_Menorah != null) {
            return _Menorah!!
        }
        _Menorah = ImageVector.Builder(
            name = "Menorah",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                verticalLineTo(6f)
                lineTo(19f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                lineTo(15f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                lineTo(11f, 2f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                lineTo(7f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(2.45f, 11f, 2f, 11.45f, 2f, 12f)
                reflectiveCurveTo(2.45f, 13f, 3f, 13f)
                horizontalLineTo(4.25f)
                curveTo(4.95f, 14.92f, 6.94f, 17.58f, 11f, 17.95f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                curveTo(8.9f, 20f, 8f, 20.9f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(16f, 20.9f, 15.11f, 20f, 14f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(17.95f)
                curveTo(17.06f, 17.57f, 19.05f, 14.92f, 19.75f, 13f)
                horizontalLineTo(21f)
                curveTo(21.55f, 13f, 22f, 12.55f, 22f, 12f)
                reflectiveCurveTo(21.55f, 11f, 21f, 11f)
                moveTo(11f, 15.94f)
                curveTo(8.34f, 15.63f, 7.05f, 14.11f, 6.45f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(15.94f)
                moveTo(13f, 15.94f)
                verticalLineTo(13f)
                horizontalLineTo(17.55f)
                curveTo(16.95f, 14.11f, 15.66f, 15.63f, 13f, 15.94f)
                close()
            }
        }.build()

        return _Menorah!!
    }

@Suppress("ObjectPropertyName")
private var _Menorah: ImageVector? = null

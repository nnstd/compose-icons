package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pump: ImageVector
    get() {
        if (_Pump != null) {
            return _Pump!!
        }
        _Pump = ImageVector.Builder(
            name = "Pump",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 21f)
                verticalLineTo(15f)
                horizontalLineTo(3.5f)
                curveTo(3.18f, 14.06f, 3f, 13.05f, 3f, 12f)
                curveTo(3f, 7.03f, 7.03f, 3f, 12f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(20.5f)
                curveTo(20.82f, 9.94f, 21f, 10.95f, 21f, 12f)
                curveTo(21f, 16.97f, 16.97f, 21f, 12f, 21f)
                horizontalLineTo(2f)
                moveTo(5f, 12f)
                curveTo(5f, 13.28f, 5.34f, 14.47f, 5.94f, 15.5f)
                lineTo(9.4f, 13.5f)
                curveTo(9.15f, 13.06f, 9f, 12.55f, 9f, 12f)
                curveTo(9f, 11.35f, 9.21f, 10.75f, 9.56f, 10.26f)
                lineTo(6.3f, 7.93f)
                curveTo(5.5f, 9.08f, 5f, 10.5f, 5f, 12f)
                moveTo(12f, 19f)
                curveTo(14.59f, 19f, 16.85f, 17.59f, 18.06f, 15.5f)
                lineTo(14.6f, 13.5f)
                curveTo(14.08f, 14.4f, 13.11f, 15f, 12f, 15f)
                lineTo(11.71f, 15f)
                lineTo(11.33f, 18.97f)
                lineTo(12f, 19f)
                moveTo(12f, 9f)
                curveTo(13.21f, 9f, 14.26f, 9.72f, 14.73f, 10.76f)
                lineTo(18.37f, 9.1f)
                curveTo(17.27f, 6.68f, 14.83f, 5f, 12f, 5f)
                verticalLineTo(9f)
                moveTo(12f, 11f)
                curveTo(11.45f, 11f, 11f, 11.45f, 11f, 12f)
                curveTo(11f, 12.55f, 11.45f, 13f, 12f, 13f)
                curveTo(12.55f, 13f, 13f, 12.55f, 13f, 12f)
                curveTo(13f, 11.45f, 12.55f, 11f, 12f, 11f)
                close()
            }
        }.build()

        return _Pump!!
    }

@Suppress("ObjectPropertyName")
private var _Pump: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedKing: ImageVector
    get() {
        if (_BedKing != null) {
            return _BedKing!!
        }
        _BedKing = ImageVector.Builder(
            name = "BedKing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                curveTo(5.47f, 5f, 5f, 5.21f, 4.59f, 5.6f)
                reflectiveCurveTo(4f, 6.45f, 4f, 7f)
                verticalLineTo(10f)
                curveTo(3.45f, 10f, 3f, 10.19f, 2.6f, 10.59f)
                reflectiveCurveTo(2f, 11.47f, 2f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(3.33f)
                lineTo(4f, 19f)
                horizontalLineTo(5f)
                lineTo(5.67f, 17f)
                horizontalLineTo(18.33f)
                lineTo(19f, 19f)
                horizontalLineTo(20f)
                lineTo(20.67f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                curveTo(22f, 11.47f, 21.79f, 11f, 21.4f, 10.59f)
                curveTo(21f, 10.19f, 20.55f, 10f, 20f, 10f)
                verticalLineTo(7f)
                curveTo(20f, 6.45f, 19.81f, 6f, 19.41f, 5.6f)
                reflectiveCurveTo(18.53f, 5f, 18f, 5f)
                moveTo(6f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                moveTo(13f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _BedKing!!
    }

@Suppress("ObjectPropertyName")
private var _BedKing: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GenderNonBinary: ImageVector
    get() {
        if (_GenderNonBinary != null) {
            return _GenderNonBinary!!
        }
        _GenderNonBinary = ImageVector.Builder(
            name = "GenderNonBinary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(5.27f)
                lineTo(9.04f, 4.13f)
                lineTo(8.04f, 5.87f)
                lineTo(10f, 7f)
                lineTo(8.04f, 8.13f)
                lineTo(9.04f, 9.87f)
                lineTo(11f, 8.73f)
                verticalLineTo(12.1f)
                curveTo(8.72f, 12.56f, 7f, 14.58f, 7f, 17f)
                curveTo(7f, 19.76f, 9.24f, 22f, 12f, 22f)
                reflectiveCurveTo(17f, 19.76f, 17f, 17f)
                curveTo(17f, 14.58f, 15.28f, 12.56f, 13f, 12.1f)
                verticalLineTo(8.73f)
                lineTo(14.96f, 9.87f)
                lineTo(15.96f, 8.13f)
                lineTo(14f, 7f)
                lineTo(15.96f, 5.87f)
                lineTo(14.96f, 4.13f)
                lineTo(13f, 5.27f)
                verticalLineTo(3f)
                moveTo(12f, 20f)
                curveTo(10.35f, 20f, 9f, 18.65f, 9f, 17f)
                reflectiveCurveTo(10.35f, 14f, 12f, 14f)
                reflectiveCurveTo(15f, 15.35f, 15f, 17f)
                reflectiveCurveTo(13.65f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _GenderNonBinary!!
    }

@Suppress("ObjectPropertyName")
private var _GenderNonBinary: ImageVector? = null

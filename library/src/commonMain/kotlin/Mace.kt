package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Mace: ImageVector
    get() {
        if (_Mace != null) {
            return _Mace!!
        }
        _Mace = ImageVector.Builder(
            name = "Mace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.92f, 9.27f)
                curveTo(19.97f, 9f, 20f, 8.76f, 20f, 8.5f)
                reflectiveCurveTo(19.97f, 8f, 19.92f, 7.73f)
                lineTo(23f, 8.5f)
                lineTo(19.92f, 9.27f)
                moveTo(14.69f, 12.92f)
                lineTo(15.5f, 16.16f)
                lineTo(16.31f, 12.92f)
                curveTo(16.05f, 12.97f, 15.78f, 13f, 15.5f, 13f)
                reflectiveCurveTo(14.95f, 12.97f, 14.69f, 12.92f)
                moveTo(11.7f, 10.89f)
                lineTo(6.79f, 15.79f)
                lineTo(6.09f, 15.09f)
                lineTo(1f, 20.17f)
                lineTo(3.83f, 23f)
                lineTo(8.91f, 17.91f)
                lineTo(8.21f, 17.21f)
                lineTo(13.11f, 12.3f)
                curveTo(12.54f, 11.94f, 12.06f, 11.46f, 11.7f, 10.89f)
                moveTo(16.27f, 4.08f)
                lineTo(15.5f, 1f)
                lineTo(14.73f, 4.08f)
                curveTo(15f, 4.03f, 15.24f, 4f, 15.5f, 4f)
                reflectiveCurveTo(16f, 4.03f, 16.27f, 4.08f)
                moveTo(8f, 8.5f)
                lineTo(11.08f, 9.27f)
                curveTo(11.03f, 9f, 11f, 8.76f, 11f, 8.5f)
                reflectiveCurveTo(11.03f, 8f, 11.08f, 7.73f)
                lineTo(8f, 8.5f)
                moveTo(18.63f, 10.04f)
                curveTo(18.86f, 9.58f, 19f, 9.06f, 19f, 8.5f)
                reflectiveCurveTo(18.86f, 7.42f, 18.63f, 6.96f)
                lineTo(21f, 3f)
                lineTo(17.04f, 5.37f)
                curveTo(16.58f, 5.14f, 16.06f, 5f, 15.5f, 5f)
                reflectiveCurveTo(14.42f, 5.14f, 13.96f, 5.37f)
                lineTo(10f, 3f)
                lineTo(12.37f, 6.96f)
                curveTo(12.14f, 7.42f, 12f, 7.94f, 12f, 8.5f)
                curveTo(12f, 10.43f, 13.57f, 12f, 15.5f, 12f)
                curveTo(16.06f, 12f, 16.58f, 11.86f, 17.04f, 11.63f)
                lineTo(21f, 14f)
                lineTo(18.63f, 10.04f)
                close()
            }
        }.build()

        return _Mace!!
    }

@Suppress("ObjectPropertyName")
private var _Mace: ImageVector? = null

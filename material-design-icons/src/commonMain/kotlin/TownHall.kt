package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TownHall: ImageVector
    get() {
        if (_TownHall != null) {
            return _TownHall!!
        }
        _TownHall = ImageVector.Builder(
            name = "TownHall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                lineTo(12.5f, 6.2f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(11.5f)
                verticalLineTo(6.2f)
                lineTo(7f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                curveTo(2.45f, 10f, 2f, 10.45f, 2f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                curveTo(22f, 10.45f, 21.55f, 10f, 21f, 10f)
                moveTo(8f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                moveTo(8f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                moveTo(12f, 8f)
                curveTo(12.55f, 8f, 13f, 8.45f, 13f, 9f)
                reflectiveCurveTo(12.55f, 10f, 12f, 10f)
                reflectiveCurveTo(11f, 9.55f, 11f, 9f)
                reflectiveCurveTo(11.45f, 8f, 12f, 8f)
                moveTo(14f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                moveTo(20f, 20f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(20f, 15f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TownHall!!
    }

@Suppress("ObjectPropertyName")
private var _TownHall: ImageVector? = null

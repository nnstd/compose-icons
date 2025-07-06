package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PoliceStation: ImageVector
    get() {
        if (_PoliceStation != null) {
            return _PoliceStation!!
        }
        _PoliceStation = ImageVector.Builder(
            name = "PoliceStation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveTo(12f, 10f, 16f, 9.2f, 16f, 7.6f)
                curveTo(16f, 6.8f, 15.2f, 5.2f, 15.2f, 4.4f)
                curveTo(15.2f, 3.6f, 16f, 2.8f, 16f, 2.8f)
                lineTo(15.2f, 2f)
                curveTo(14.74f, 2.26f, 14.16f, 2.4f, 13.6f, 2.4f)
                reflectiveCurveTo(12.46f, 2.25f, 12f, 2f)
                curveTo(11.54f, 2.25f, 10.96f, 2.4f, 10.4f, 2.4f)
                curveTo(9.84f, 2.4f, 9.26f, 2.26f, 8.8f, 2f)
                lineTo(8f, 2.8f)
                curveTo(8f, 2.8f, 8.8f, 3.6f, 8.8f, 4.4f)
                curveTo(8.8f, 5.2f, 8f, 6.8f, 8f, 7.6f)
                curveTo(8f, 9.2f, 12f, 10f, 12f, 10f)
                moveTo(11.43f, 5.32f)
                lineTo(12f, 4f)
                lineTo(12.55f, 5.32f)
                lineTo(14f, 5.44f)
                lineTo(12.89f, 6.38f)
                lineTo(13.22f, 7.78f)
                lineTo(12f, 7.04f)
                lineTo(10.76f, 7.78f)
                lineTo(11.09f, 6.38f)
                lineTo(10f, 5.44f)
                lineTo(11.43f, 5.32f)
                moveTo(21f, 6f)
                horizontalLineTo(16.65f)
                curveTo(16.84f, 6.58f, 17f, 7.12f, 17f, 7.6f)
                curveTo(17f, 9.85f, 13.32f, 10.76f, 12.2f, 11f)
                lineTo(12f, 11f)
                lineTo(11.8f, 11f)
                curveTo(10.68f, 10.76f, 7f, 9.85f, 7f, 7.6f)
                curveTo(7f, 7.12f, 7.16f, 6.58f, 7.35f, 6f)
                horizontalLineTo(3f)
                curveTo(2.45f, 6f, 2f, 6.45f, 2f, 7f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                curveTo(22f, 6.45f, 21.55f, 6f, 21f, 6f)
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

        return _PoliceStation!!
    }

@Suppress("ObjectPropertyName")
private var _PoliceStation: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusMultiple: ImageVector
    get() {
        if (_BusMultiple != null) {
            return _BusMultiple!!
        }
        _BusMultiple = ImageVector.Builder(
            name = "BusMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 5f)
                curveTo(5.58f, 5f, 2f, 5.5f, 2f, 9f)
                verticalLineTo(19f)
                curveTo(2f, 19.85f, 2.37f, 20.66f, 3f, 21.22f)
                verticalLineTo(23f)
                curveTo(3f, 23.55f, 3.45f, 24f, 4f, 24f)
                horizontalLineTo(5f)
                curveTo(5.55f, 24f, 6f, 23.55f, 6f, 23f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(23f)
                curveTo(14f, 23.55f, 14.45f, 24f, 15f, 24f)
                horizontalLineTo(16f)
                curveTo(16.55f, 24f, 17f, 23.55f, 17f, 23f)
                verticalLineTo(21.22f)
                curveTo(17.63f, 20.66f, 18f, 19.85f, 18f, 19f)
                verticalLineTo(9f)
                curveTo(18f, 5.5f, 14.42f, 5f, 10f, 5f)
                moveTo(5.5f, 20f)
                curveTo(4.67f, 20f, 4f, 19.33f, 4f, 18.5f)
                reflectiveCurveTo(4.67f, 17f, 5.5f, 17f)
                reflectiveCurveTo(7f, 17.67f, 7f, 18.5f)
                reflectiveCurveTo(6.33f, 20f, 5.5f, 20f)
                moveTo(14.5f, 20f)
                curveTo(13.67f, 20f, 13f, 19.33f, 13f, 18.5f)
                reflectiveCurveTo(13.67f, 17f, 14.5f, 17f)
                reflectiveCurveTo(16f, 17.67f, 16f, 18.5f)
                reflectiveCurveTo(15.33f, 20f, 14.5f, 20f)
                moveTo(16f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                moveTo(22f, 5f)
                verticalLineTo(15f)
                curveTo(22f, 15.85f, 21.63f, 16.66f, 21f, 17.22f)
                verticalLineTo(19f)
                curveTo(21f, 19.55f, 20.55f, 20f, 20f, 20f)
                horizontalLineTo(19.88f)
                curveTo(19.95f, 19.68f, 20f, 19.35f, 20f, 19f)
                verticalLineTo(9f)
                curveTo(20f, 3f, 13f, 3f, 10f, 3f)
                curveTo(9.09f, 3f, 7.8f, 3f, 6.46f, 3.17f)
                curveTo(7.55f, 1.32f, 10.5f, 1f, 14f, 1f)
                curveTo(18.42f, 1f, 22f, 1.5f, 22f, 5f)
                close()
            }
        }.build()

        return _BusMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _BusMultiple: ImageVector? = null

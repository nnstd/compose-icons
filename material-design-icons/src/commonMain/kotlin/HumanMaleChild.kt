package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleChild: ImageVector
    get() {
        if (_HumanMaleChild != null) {
            return _HumanMaleChild!!
        }
        _HumanMaleChild = ImageVector.Builder(
            name = "HumanMaleChild",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveTo(5.9f, 2f, 5f, 2.9f, 5f, 4f)
                reflectiveCurveTo(5.9f, 6f, 7f, 6f)
                reflectiveCurveTo(9f, 5.11f, 9f, 4f)
                reflectiveCurveTo(8.11f, 2f, 7f, 2f)
                moveTo(5f, 7f)
                curveTo(3.89f, 7f, 3f, 7.89f, 3f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(11.6f)
                lineTo(12.53f, 16f)
                horizontalLineTo(14.97f)
                lineTo(16f, 14.66f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                curveTo(21f, 12.89f, 20.11f, 12f, 19f, 12f)
                horizontalLineTo(16.5f)
                curveTo(15.9f, 12f, 15.37f, 12.26f, 15f, 12.68f)
                curveTo(14.67f, 13.1f, 14.32f, 13.56f, 14f, 14f)
                horizontalLineTo(13.69f)
                lineTo(10f, 7.66f)
                curveTo(9.84f, 7.38f, 9.22f, 7f, 8.5f, 7f)
                horizontalLineTo(5f)
                moveTo(18f, 8f)
                curveTo(17.17f, 8f, 16.5f, 8.67f, 16.5f, 9.5f)
                reflectiveCurveTo(17.17f, 11f, 18f, 11f)
                reflectiveCurveTo(19.5f, 10.33f, 19.5f, 9.5f)
                reflectiveCurveTo(18.83f, 8f, 18f, 8f)
                close()
            }
        }.build()

        return _HumanMaleChild!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleChild: ImageVector? = null

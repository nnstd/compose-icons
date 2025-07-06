package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrentAc: ImageVector
    get() {
        if (_CurrentAc != null) {
            return _CurrentAc!!
        }
        _CurrentAc = ImageVector.Builder(
            name = "CurrentAc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.43f, 11f)
                curveTo(12.28f, 10.84f, 10f, 7f, 7f, 7f)
                reflectiveCurveTo(2.32f, 10.18f, 2f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(11.57f)
                curveTo(11.72f, 13.16f, 14f, 17f, 17f, 17f)
                reflectiveCurveTo(21.68f, 13.82f, 22f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(12.43f)
                moveTo(7f, 9f)
                curveTo(8.17f, 9f, 9.18f, 9.85f, 10f, 11f)
                horizontalLineTo(4.31f)
                curveTo(4.78f, 10.17f, 5.54f, 9f, 7f, 9f)
                moveTo(17f, 15f)
                curveTo(15.83f, 15f, 14.82f, 14.15f, 14f, 13f)
                horizontalLineTo(19.69f)
                curveTo(19.22f, 13.83f, 18.46f, 15f, 17f, 15f)
                close()
            }
        }.build()

        return _CurrentAc!!
    }

@Suppress("ObjectPropertyName")
private var _CurrentAc: ImageVector? = null

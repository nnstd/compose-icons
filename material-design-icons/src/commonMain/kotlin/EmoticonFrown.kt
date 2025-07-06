package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonFrown: ImageVector
    get() {
        if (_EmoticonFrown != null) {
            return _EmoticonFrown!!
        }
        _EmoticonFrown = ImageVector.Builder(
            name = "EmoticonFrown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.47f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(15.5f, 8f)
                curveTo(16.33f, 8f, 17f, 8.67f, 17f, 9.5f)
                reflectiveCurveTo(16.33f, 11f, 15.5f, 11f)
                reflectiveCurveTo(14f, 10.33f, 14f, 9.5f)
                reflectiveCurveTo(14.67f, 8f, 15.5f, 8f)
                moveTo(8.5f, 8f)
                curveTo(9.33f, 8f, 10f, 8.67f, 10f, 9.5f)
                reflectiveCurveTo(9.33f, 11f, 8.5f, 11f)
                reflectiveCurveTo(7f, 10.33f, 7f, 9.5f)
                reflectiveCurveTo(7.67f, 8f, 8.5f, 8f)
                moveTo(6.89f, 17f)
                curveTo(7.69f, 14.96f, 9.67f, 13.5f, 12f, 13.5f)
                reflectiveCurveTo(16.31f, 14.96f, 17.11f, 17f)
                horizontalLineTo(6.89f)
                close()
            }
        }.build()

        return _EmoticonFrown!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonFrown: ImageVector? = null

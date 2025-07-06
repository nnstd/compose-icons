package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonFrownOutline: ImageVector
    get() {
        if (_EmoticonFrownOutline != null) {
            return _EmoticonFrownOutline!!
        }
        _EmoticonFrownOutline = ImageVector.Builder(
            name = "EmoticonFrownOutline",
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
                moveTo(12f, 20f)
                curveTo(7.58f, 20f, 4f, 16.42f, 4f, 12f)
                reflectiveCurveTo(7.58f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.58f, 20f, 12f)
                reflectiveCurveTo(16.42f, 20f, 12f, 20f)
                moveTo(15.5f, 11f)
                curveTo(16.33f, 11f, 17f, 10.33f, 17f, 9.5f)
                reflectiveCurveTo(16.33f, 8f, 15.5f, 8f)
                reflectiveCurveTo(14f, 8.67f, 14f, 9.5f)
                reflectiveCurveTo(14.67f, 11f, 15.5f, 11f)
                moveTo(8.5f, 11f)
                curveTo(9.33f, 11f, 10f, 10.33f, 10f, 9.5f)
                reflectiveCurveTo(9.33f, 8f, 8.5f, 8f)
                reflectiveCurveTo(7f, 8.67f, 7f, 9.5f)
                reflectiveCurveTo(7.67f, 11f, 8.5f, 11f)
                moveTo(12f, 13.5f)
                curveTo(9.67f, 13.5f, 7.69f, 14.96f, 6.89f, 17f)
                horizontalLineTo(17.11f)
                curveTo(16.31f, 14.96f, 14.33f, 13.5f, 12f, 13.5f)
                close()
            }
        }.build()

        return _EmoticonFrownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonFrownOutline: ImageVector? = null

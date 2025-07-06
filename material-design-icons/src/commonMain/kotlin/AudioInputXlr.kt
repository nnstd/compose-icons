package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AudioInputXlr: ImageVector
    get() {
        if (_AudioInputXlr != null) {
            return _AudioInputXlr!!
        }
        _AudioInputXlr = ImageVector.Builder(
            name = "AudioInputXlr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(16.41f, 4f, 20f, 7.59f, 20f, 12f)
                reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.41f, 4f, 12f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(13.5f, 16.5f)
                curveTo(13.5f, 15.67f, 12.83f, 15f, 12f, 15f)
                reflectiveCurveTo(10.5f, 15.67f, 10.5f, 16.5f)
                curveTo(10.5f, 17.33f, 11.17f, 18f, 12f, 18f)
                reflectiveCurveTo(13.5f, 17.33f, 13.5f, 16.5f)
                moveTo(9f, 12f)
                curveTo(9f, 11.17f, 8.33f, 10.5f, 7.5f, 10.5f)
                reflectiveCurveTo(6f, 11.17f, 6f, 12f)
                reflectiveCurveTo(6.67f, 13.5f, 7.5f, 13.5f)
                reflectiveCurveTo(9f, 12.83f, 9f, 12f)
                moveTo(18f, 12f)
                curveTo(18f, 11.17f, 17.33f, 10.5f, 16.5f, 10.5f)
                curveTo(15.67f, 10.5f, 15f, 11.17f, 15f, 12f)
                reflectiveCurveTo(15.67f, 13.5f, 16.5f, 13.5f)
                curveTo(17.33f, 13.5f, 18f, 12.83f, 18f, 12f)
                close()
            }
        }.build()

        return _AudioInputXlr!!
    }

@Suppress("ObjectPropertyName")
private var _AudioInputXlr: ImageVector? = null

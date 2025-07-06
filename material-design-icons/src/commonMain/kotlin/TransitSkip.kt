package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransitSkip: ImageVector
    get() {
        if (_TransitSkip != null) {
            return _TransitSkip!!
        }
        _TransitSkip = ImageVector.Builder(
            name = "TransitSkip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                curveTo(21f, 8f, 18.5f, 4.7f, 15f, 3.5f)
                curveTo(14.7f, 2.1f, 13.5f, 1f, 12f, 1f)
                curveTo(10.3f, 1f, 9f, 2.3f, 9f, 4f)
                reflectiveCurveTo(10.3f, 7f, 12f, 7f)
                curveTo(13.1f, 7f, 14.1f, 6.4f, 14.6f, 5.5f)
                curveTo(17.2f, 6.5f, 19f, 9f, 19f, 12f)
                curveTo(19f, 14.9f, 17.2f, 17.5f, 14.6f, 18.5f)
                curveTo(14.1f, 17.6f, 13.1f, 17f, 12f, 17f)
                curveTo(10.3f, 17f, 9f, 18.3f, 9f, 20f)
                reflectiveCurveTo(10.3f, 23f, 12f, 23f)
                curveTo(13.5f, 23f, 14.7f, 21.9f, 15f, 20.5f)
                curveTo(18.5f, 19.3f, 21f, 15.9f, 21f, 12f)
                moveTo(12f, 5f)
                curveTo(11.4f, 5f, 11f, 4.6f, 11f, 4f)
                reflectiveCurveTo(11.4f, 3f, 12f, 3f)
                reflectiveCurveTo(13f, 3.4f, 13f, 4f)
                reflectiveCurveTo(12.6f, 5f, 12f, 5f)
                moveTo(12f, 21f)
                curveTo(11.4f, 21f, 11f, 20.6f, 11f, 20f)
                reflectiveCurveTo(11.4f, 19f, 12f, 19f)
                reflectiveCurveTo(13f, 19.4f, 13f, 20f)
                reflectiveCurveTo(12.6f, 21f, 12f, 21f)
                moveTo(12f, 9f)
                curveTo(13.7f, 9f, 15f, 10.3f, 15f, 12f)
                reflectiveCurveTo(13.7f, 15f, 12f, 15f)
                reflectiveCurveTo(9f, 13.7f, 9f, 12f)
                reflectiveCurveTo(10.3f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _TransitSkip!!
    }

@Suppress("ObjectPropertyName")
private var _TransitSkip: ImageVector? = null

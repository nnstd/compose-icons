package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShareCircle: ImageVector
    get() {
        if (_ShareCircle != null) {
            return _ShareCircle!!
        }
        _ShareCircle = ImageVector.Builder(
            name = "ShareCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(14f, 16f)
                verticalLineTo(13f)
                curveTo(10.39f, 13f, 7.81f, 14.43f, 6f, 17f)
                curveTo(6.72f, 13.33f, 8.94f, 9.73f, 14f, 9f)
                verticalLineTo(6f)
                lineTo(19f, 11f)
                lineTo(14f, 16f)
                close()
            }
        }.build()

        return _ShareCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ShareCircle: ImageVector? = null

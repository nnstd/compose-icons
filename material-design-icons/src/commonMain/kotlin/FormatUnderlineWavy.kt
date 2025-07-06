package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatUnderlineWavy: ImageVector
    get() {
        if (_FormatUnderlineWavy != null) {
            return _FormatUnderlineWavy!!
        }
        _FormatUnderlineWavy = ImageVector.Builder(
            name = "FormatUnderlineWavy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveTo(15.31f, 17f, 18f, 14.31f, 18f, 11f)
                verticalLineTo(3f)
                horizontalLineTo(15.5f)
                verticalLineTo(11f)
                curveTo(15.5f, 12.93f, 13.93f, 14.5f, 12f, 14.5f)
                reflectiveCurveTo(8.5f, 12.93f, 8.5f, 11f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                curveTo(6f, 14.31f, 8.69f, 17f, 12f, 17f)
                moveTo(20f, 22f)
                curveTo(18.6f, 22f, 17.8f, 21.3f, 17.3f, 20.7f)
                curveTo(16.8f, 20.2f, 16.6f, 20f, 16f, 20f)
                reflectiveCurveTo(15.2f, 20.2f, 14.7f, 20.7f)
                curveTo(14.2f, 21.3f, 13.4f, 22f, 12f, 22f)
                reflectiveCurveTo(9.8f, 21.3f, 9.3f, 20.7f)
                curveTo(8.8f, 20.2f, 8.6f, 20f, 8f, 20f)
                reflectiveCurveTo(7.2f, 20.2f, 6.7f, 20.7f)
                curveTo(6.2f, 21.3f, 5.4f, 22f, 4f, 22f)
                verticalLineTo(20f)
                curveTo(4.6f, 20f, 4.8f, 19.8f, 5.3f, 19.3f)
                curveTo(5.8f, 18.7f, 6.6f, 18f, 8f, 18f)
                reflectiveCurveTo(10.2f, 18.7f, 10.7f, 19.3f)
                curveTo(11.2f, 19.8f, 11.4f, 20f, 12f, 20f)
                reflectiveCurveTo(12.8f, 19.8f, 13.3f, 19.3f)
                curveTo(13.8f, 18.7f, 14.6f, 18f, 16f, 18f)
                reflectiveCurveTo(18.2f, 18.7f, 18.7f, 19.3f)
                curveTo(19.2f, 19.8f, 19.4f, 20f, 20f, 20f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _FormatUnderlineWavy!!
    }

@Suppress("ObjectPropertyName")
private var _FormatUnderlineWavy: ImageVector? = null

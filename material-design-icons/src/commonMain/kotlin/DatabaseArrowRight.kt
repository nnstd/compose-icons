package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseArrowRight: ImageVector
    get() {
        if (_DatabaseArrowRight != null) {
            return _DatabaseArrowRight!!
        }
        _DatabaseArrowRight = ImageVector.Builder(
            name = "DatabaseArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 7f)
                curveTo(4f, 4.79f, 7.58f, 3f, 12f, 3f)
                reflectiveCurveTo(20f, 4.79f, 20f, 7f)
                reflectiveCurveTo(16.42f, 11f, 12f, 11f)
                reflectiveCurveTo(4f, 9.21f, 4f, 7f)
                moveTo(19.72f, 13.05f)
                curveTo(19.9f, 12.71f, 20f, 12.36f, 20f, 12f)
                verticalLineTo(9f)
                curveTo(20f, 11.21f, 16.42f, 13f, 12f, 13f)
                reflectiveCurveTo(4f, 11.21f, 4f, 9f)
                verticalLineTo(12f)
                curveTo(4f, 14.21f, 7.58f, 16f, 12f, 16f)
                curveTo(12.65f, 16f, 13.28f, 15.96f, 13.88f, 15.89f)
                curveTo(14.93f, 14.16f, 16.83f, 13f, 19f, 13f)
                curveTo(19.24f, 13f, 19.5f, 13f, 19.72f, 13.05f)
                moveTo(13.1f, 17.96f)
                curveTo(12.74f, 18f, 12.37f, 18f, 12f, 18f)
                curveTo(7.58f, 18f, 4f, 16.21f, 4f, 14f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.58f, 21f, 12f, 21f)
                curveTo(12.46f, 21f, 12.9f, 21f, 13.33f, 20.94f)
                curveTo(13.12f, 20.33f, 13f, 19.68f, 13f, 19f)
                curveTo(13f, 18.64f, 13.04f, 18.3f, 13.1f, 17.96f)
                moveTo(23f, 19f)
                lineTo(20f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                lineTo(23f, 19f)
                close()
            }
        }.build()

        return _DatabaseArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseArrowRight: ImageVector? = null

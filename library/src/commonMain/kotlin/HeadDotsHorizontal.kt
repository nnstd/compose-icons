package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadDotsHorizontal: ImageVector
    get() {
        if (_HeadDotsHorizontal != null) {
            return _HeadDotsHorizontal!!
        }
        _HeadDotsHorizontal = ImageVector.Builder(
            name = "HeadDotsHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(9.23f, 3f, 6.19f, 5.95f, 6f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13f, 4.5f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.89f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20f, 12.8f, 20f, 10f)
                curveTo(20f, 6.14f, 16.88f, 3f, 13f, 3f)
                moveTo(10f, 11f)
                curveTo(9.45f, 11f, 9f, 10.55f, 9f, 10f)
                reflectiveCurveTo(9.45f, 9f, 10f, 9f)
                reflectiveCurveTo(11f, 9.45f, 11f, 10f)
                reflectiveCurveTo(10.55f, 11f, 10f, 11f)
                moveTo(13f, 11f)
                curveTo(12.45f, 11f, 12f, 10.55f, 12f, 10f)
                reflectiveCurveTo(12.45f, 9f, 13f, 9f)
                reflectiveCurveTo(14f, 9.45f, 14f, 10f)
                reflectiveCurveTo(13.55f, 11f, 13f, 11f)
                moveTo(16f, 11f)
                curveTo(15.45f, 11f, 15f, 10.55f, 15f, 10f)
                reflectiveCurveTo(15.45f, 9f, 16f, 9f)
                reflectiveCurveTo(17f, 9.45f, 17f, 10f)
                reflectiveCurveTo(16.55f, 11f, 16f, 11f)
                close()
            }
        }.build()

        return _HeadDotsHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _HeadDotsHorizontal: ImageVector? = null

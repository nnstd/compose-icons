package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeCircleOutline: ImageVector
    get() {
        if (_HomeCircleOutline != null) {
            return _HomeCircleOutline!!
        }
        _HomeCircleOutline = ImageVector.Builder(
            name = "HomeCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveTo(7.6f, 20f, 4f, 16.4f, 4f, 12f)
                reflectiveCurveTo(7.6f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.6f, 20f, 12f)
                reflectiveCurveTo(16.4f, 20f, 12f, 20f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                lineTo(12f, 7f)
                lineTo(6f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
            }
        }.build()

        return _HomeCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeCircleOutline: ImageVector? = null

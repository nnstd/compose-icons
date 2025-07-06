package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTag: ImageVector
    get() {
        if (_AccountTag != null) {
            return _AccountTag!!
        }
        _AccountTag = ImageVector.Builder(
            name = "AccountTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 17.8f)
                lineTo(18.2f, 14.2f)
                curveTo(18f, 14.1f, 17.8f, 14f, 17.6f, 14f)
                horizontalLineTo(14.8f)
                curveTo(14.4f, 14f, 14f, 14.4f, 14f, 14.8f)
                verticalLineTo(17.6f)
                curveTo(14f, 17.8f, 14.1f, 18f, 14.2f, 18.2f)
                lineTo(17.8f, 21.8f)
                curveTo(17.9f, 21.9f, 18.1f, 22f, 18.4f, 22f)
                curveTo(18.6f, 22f, 18.8f, 21.9f, 19f, 21.8f)
                lineTo(21.8f, 19f)
                curveTo(21.9f, 18.9f, 22f, 18.7f, 22f, 18.4f)
                curveTo(22f, 18.2f, 21.9f, 18f, 21.8f, 17.8f)
                moveTo(15.4f, 16f)
                curveTo(15.1f, 16f, 14.8f, 15.7f, 14.8f, 15.4f)
                curveTo(14.8f, 15.1f, 15.1f, 14.8f, 15.4f, 14.8f)
                curveTo(15.7f, 14.8f, 16f, 15.1f, 16f, 15.4f)
                curveTo(16f, 15.7f, 15.7f, 16f, 15.4f, 16f)
                moveTo(10f, 4f)
                curveTo(7.8f, 4f, 6f, 5.8f, 6f, 8f)
                reflectiveCurveTo(7.8f, 12f, 10f, 12f)
                reflectiveCurveTo(14f, 10.2f, 14f, 8f)
                reflectiveCurveTo(12.2f, 4f, 10f, 4f)
                moveTo(10f, 14f)
                curveTo(5.6f, 14f, 2f, 15.8f, 2f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(13.2f)
                lineTo(12.8f, 19.6f)
                curveTo(12.3f, 19.1f, 12f, 18.4f, 12f, 17.6f)
                verticalLineTo(14.8f)
                curveTo(12f, 14.6f, 12f, 14.4f, 12.1f, 14.1f)
                curveTo(11.4f, 14f, 10.7f, 14f, 10f, 14f)
                close()
            }
        }.build()

        return _AccountTag!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTag: ImageVector? = null

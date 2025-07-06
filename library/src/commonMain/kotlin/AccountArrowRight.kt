package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountArrowRight: ImageVector
    get() {
        if (_AccountArrowRight != null) {
            return _AccountArrowRight!!
        }
        _AccountArrowRight = ImageVector.Builder(
            name = "AccountArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                lineTo(21f, 17f)
                lineTo(18f, 14f)
                verticalLineTo(16f)
                moveTo(11f, 4f)
                curveTo(8.8f, 4f, 7f, 5.8f, 7f, 8f)
                reflectiveCurveTo(8.8f, 12f, 11f, 12f)
                reflectiveCurveTo(15f, 10.2f, 15f, 8f)
                reflectiveCurveTo(13.2f, 4f, 11f, 4f)
                moveTo(11f, 14f)
                curveTo(6.6f, 14f, 3f, 15.8f, 3f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(12.5f)
                curveTo(12.2f, 19.2f, 12f, 18.4f, 12f, 17.5f)
                curveTo(12f, 16.3f, 12.3f, 15.2f, 12.9f, 14.1f)
                curveTo(12.3f, 14.1f, 11.7f, 14f, 11f, 14f)
            }
        }.build()

        return _AccountArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _AccountArrowRight: ImageVector? = null

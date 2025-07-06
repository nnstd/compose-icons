package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FireHydrantAlert: ImageVector
    get() {
        if (_FireHydrantAlert != null) {
            return _FireHydrantAlert!!
        }
        _FireHydrantAlert = ImageVector.Builder(
            name = "FireHydrantAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                moveTo(22f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                moveTo(3f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                moveTo(17f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                moveTo(16f, 6f)
                horizontalLineTo(13.86f)
                curveTo(13.5f, 4.6f, 12.4f, 3.5f, 11f, 3.14f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(3.14f)
                curveTo(7.6f, 3.5f, 6.5f, 4.6f, 6.14f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                moveTo(16f, 22f)
                horizontalLineTo(4f)
                curveTo(4f, 20.9f, 4.89f, 20f, 6f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                curveTo(15.11f, 20f, 16f, 20.9f, 16f, 22f)
                moveTo(8f, 13f)
                curveTo(8f, 14.11f, 8.9f, 15f, 10f, 15f)
                reflectiveCurveTo(12f, 14.11f, 12f, 13f)
                reflectiveCurveTo(11.11f, 11f, 10f, 11f)
                reflectiveCurveTo(8f, 11.9f, 8f, 13f)
                close()
            }
        }.build()

        return _FireHydrantAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FireHydrantAlert: ImageVector? = null

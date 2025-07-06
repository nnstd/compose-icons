package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric10CircleOutline: ImageVector
    get() {
        if (_Numeric10CircleOutline != null) {
            return _Numeric10CircleOutline!!
        }
        _Numeric10CircleOutline = ImageVector.Builder(
            name = "Numeric10CircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 22f, 12f, 22f)
                reflectiveCurveTo(2f, 17.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(7.58f, 4f, 4f, 7.58f, 4f, 12f)
                reflectiveCurveTo(7.58f, 20f, 12f, 20f)
                reflectiveCurveTo(20f, 16.42f, 20f, 12f)
                reflectiveCurveTo(16.42f, 4f, 12f, 4f)
                moveTo(10f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(16f, 7f)
                horizontalLineTo(14f)
                curveTo(12.9f, 7f, 12f, 7.9f, 12f, 9f)
                verticalLineTo(15f)
                curveTo(12f, 16.11f, 12.9f, 17f, 14f, 17f)
                horizontalLineTo(16f)
                curveTo(17.11f, 17f, 18f, 16.11f, 18f, 15f)
                verticalLineTo(9f)
                curveTo(18f, 7.9f, 17.11f, 7f, 16f, 7f)
                moveTo(16f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Numeric10CircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric10CircleOutline: ImageVector? = null

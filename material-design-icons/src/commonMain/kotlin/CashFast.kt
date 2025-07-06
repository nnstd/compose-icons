package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashFast: ImageVector
    get() {
        if (_CashFast != null) {
            return _CashFast!!
        }
        _CashFast = ImageVector.Builder(
            name = "CashFast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.12f, 9.88f)
                curveTo(16.56f, 9.32f, 15.8f, 9f, 15f, 9f)
                reflectiveCurveTo(13.44f, 9.32f, 12.88f, 9.88f)
                curveTo(12.32f, 10.44f, 12f, 11.2f, 12f, 12f)
                reflectiveCurveTo(12.32f, 13.56f, 12.88f, 14.12f)
                reflectiveCurveTo(14.2f, 15f, 15f, 15f)
                reflectiveCurveTo(16.56f, 14.68f, 17.12f, 14.12f)
                reflectiveCurveTo(18f, 12.8f, 18f, 12f)
                reflectiveCurveTo(17.68f, 10.44f, 17.12f, 9.88f)
                moveTo(7f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                moveTo(21f, 14f)
                curveTo(20.47f, 14f, 19.96f, 14.21f, 19.59f, 14.59f)
                curveTo(19.21f, 14.96f, 19f, 15.47f, 19f, 16f)
                horizontalLineTo(11f)
                curveTo(11f, 15.47f, 10.79f, 14.96f, 10.41f, 14.59f)
                curveTo(10.04f, 14.21f, 9.53f, 14f, 9f, 14f)
                verticalLineTo(10f)
                curveTo(9.53f, 10f, 10.04f, 9.79f, 10.41f, 9.41f)
                curveTo(10.79f, 9.04f, 11f, 8.53f, 11f, 8f)
                horizontalLineTo(19f)
                curveTo(19f, 8.53f, 19.21f, 9.04f, 19.59f, 9.41f)
                curveTo(19.96f, 9.79f, 20.47f, 10f, 21f, 10f)
                verticalLineTo(14f)
                moveTo(5f, 8f)
                horizontalLineTo(3f)
                curveTo(2.45f, 8f, 2f, 7.55f, 2f, 7f)
                curveTo(2f, 6.45f, 2.45f, 6f, 3f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                moveTo(5f, 13f)
                horizontalLineTo(2f)
                curveTo(1.45f, 13f, 1f, 12.55f, 1f, 12f)
                curveTo(1f, 11.45f, 1.45f, 11f, 2f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                moveTo(5f, 18f)
                horizontalLineTo(1f)
                curveTo(0.448f, 18f, 0f, 17.55f, 0f, 17f)
                curveTo(0f, 16.45f, 0.448f, 16f, 1f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _CashFast!!
    }

@Suppress("ObjectPropertyName")
private var _CashFast: ImageVector? = null

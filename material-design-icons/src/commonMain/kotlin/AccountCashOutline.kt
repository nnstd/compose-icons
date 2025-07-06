package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCashOutline: ImageVector
    get() {
        if (_AccountCashOutline != null) {
            return _AccountCashOutline!!
        }
        _AccountCashOutline = ImageVector.Builder(
            name = "AccountCashOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11.5f)
                curveTo(16f, 10.12f, 17.12f, 9f, 18.5f, 9f)
                reflectiveCurveTo(21f, 10.12f, 21f, 11.5f)
                reflectiveCurveTo(19.88f, 14f, 18.5f, 14f)
                reflectiveCurveTo(16f, 12.88f, 16f, 11.5f)
                moveTo(13f, 3f)
                verticalLineTo(20f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                moveTo(22f, 16f)
                curveTo(20.9f, 16f, 20f, 16.9f, 20f, 18f)
                horizontalLineTo(17f)
                curveTo(17f, 16.9f, 16.11f, 16f, 15f, 16f)
                verticalLineTo(7f)
                curveTo(16.11f, 7f, 17f, 6.11f, 17f, 5f)
                horizontalLineTo(20f)
                curveTo(20f, 6.11f, 20.9f, 7f, 22f, 7f)
                verticalLineTo(16f)
                moveTo(7f, 6f)
                curveTo(8.1f, 6f, 9f, 6.9f, 9f, 8f)
                reflectiveCurveTo(8.1f, 10f, 7f, 10f)
                reflectiveCurveTo(5f, 9.1f, 5f, 8f)
                reflectiveCurveTo(5.9f, 6f, 7f, 6f)
                moveTo(7f, 4f)
                curveTo(4.79f, 4f, 3f, 5.79f, 3f, 8f)
                reflectiveCurveTo(4.79f, 12f, 7f, 12f)
                reflectiveCurveTo(11f, 10.21f, 11f, 8f)
                reflectiveCurveTo(9.21f, 4f, 7f, 4f)
                moveTo(7f, 14f)
                curveTo(3.13f, 14f, 0f, 15.79f, 0f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                curveTo(2f, 17.42f, 3.75f, 16f, 7f, 16f)
                curveTo(8.83f, 16f, 10.17f, 16.45f, 11f, 16.95f)
                verticalLineTo(14.72f)
                curveTo(9.87f, 14.27f, 8.5f, 14f, 7f, 14f)
                close()
            }
        }.build()

        return _AccountCashOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCashOutline: ImageVector? = null

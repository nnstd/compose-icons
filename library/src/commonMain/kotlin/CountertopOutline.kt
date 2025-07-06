package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CountertopOutline: ImageVector
    get() {
        if (_CountertopOutline != null) {
            return _CountertopOutline!!
        }
        _CountertopOutline = ImageVector.Builder(
            name = "CountertopOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                curveTo(18f, 5.34f, 16.66f, 4f, 15f, 4f)
                reflectiveCurveTo(12f, 5.34f, 12f, 7f)
                horizontalLineTo(14f)
                curveTo(14f, 6.45f, 14.45f, 6f, 15f, 6f)
                reflectiveCurveTo(16f, 6.45f, 16f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                curveTo(9.1f, 10f, 10f, 9.1f, 10f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                curveTo(4f, 9.1f, 4.9f, 10f, 6f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                moveTo(6f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                moveTo(6f, 18f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                moveTo(18f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _CountertopOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CountertopOutline: ImageVector? = null

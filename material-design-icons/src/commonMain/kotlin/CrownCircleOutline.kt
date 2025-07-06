package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrownCircleOutline: ImageVector
    get() {
        if (_CrownCircleOutline != null) {
            return _CrownCircleOutline!!
        }
        _CrownCircleOutline = ImageVector.Builder(
            name = "CrownCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(12f, 20f)
                curveTo(7.58f, 20f, 4f, 16.42f, 4f, 12f)
                curveTo(4f, 7.58f, 7.58f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.58f, 20f, 12f)
                curveTo(20f, 16.42f, 16.42f, 20f, 12f, 20f)
                moveTo(8f, 14f)
                lineTo(7f, 8f)
                lineTo(10f, 10f)
                lineTo(12f, 7f)
                lineTo(14f, 10f)
                lineTo(17f, 8f)
                lineTo(16f, 14f)
                horizontalLineTo(8f)
                moveTo(8.56f, 16f)
                curveTo(8.22f, 16f, 8f, 15.78f, 8f, 15.44f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(15.44f)
                curveTo(16f, 15.78f, 15.78f, 16f, 15.44f, 16f)
                horizontalLineTo(8.56f)
                close()
            }
        }.build()

        return _CrownCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CrownCircleOutline: ImageVector? = null

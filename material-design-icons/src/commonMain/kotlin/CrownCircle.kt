package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrownCircle: ImageVector
    get() {
        if (_CrownCircle != null) {
            return _CrownCircle!!
        }
        _CrownCircle = ImageVector.Builder(
            name = "CrownCircle",
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
                moveTo(16f, 15.44f)
                curveTo(16f, 15.78f, 15.78f, 16f, 15.44f, 16f)
                horizontalLineTo(8.56f)
                curveTo(8.22f, 16f, 8f, 15.78f, 8f, 15.44f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(15.44f)
                moveTo(16f, 14f)
                horizontalLineTo(8f)
                lineTo(7f, 8f)
                lineTo(10f, 10f)
                lineTo(12f, 7f)
                lineTo(14f, 10f)
                lineTo(17f, 8f)
                lineTo(16f, 14f)
                close()
            }
        }.build()

        return _CrownCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CrownCircle: ImageVector? = null

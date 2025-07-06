package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Merge: ImageVector
    get() {
        if (_Merge != null) {
            return _Merge!!
        }
        _Merge = ImageVector.Builder(
            name = "Merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 17f)
                lineTo(12f, 13f)
                horizontalLineTo(15.2f)
                curveTo(15.6f, 14.2f, 16.7f, 15f, 18f, 15f)
                curveTo(19.7f, 15f, 21f, 13.7f, 21f, 12f)
                reflectiveCurveTo(19.7f, 9f, 18f, 9f)
                curveTo(16.7f, 9f, 15.6f, 9.8f, 15.2f, 11f)
                horizontalLineTo(12f)
                lineTo(8f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                lineTo(10.2f, 12f)
                lineTo(6f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Merge!!
    }

@Suppress("ObjectPropertyName")
private var _Merge: ImageVector? = null

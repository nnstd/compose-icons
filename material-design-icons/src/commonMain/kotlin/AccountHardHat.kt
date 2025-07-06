package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountHardHat: ImageVector
    get() {
        if (_AccountHardHat != null) {
            return _AccountHardHat!!
        }
        _AccountHardHat = ImageVector.Builder(
            name = "AccountHardHat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                curveTo(7.58f, 15f, 4f, 16.79f, 4f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                curveTo(20f, 16.79f, 16.42f, 15f, 12f, 15f)
                moveTo(8f, 9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                moveTo(11.5f, 2f)
                curveTo(11.2f, 2f, 11f, 2.21f, 11f, 2.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                curveTo(10f, 3f, 7.75f, 3.86f, 7.75f, 6.75f)
                curveTo(7.75f, 6.75f, 7f, 6.89f, 7f, 8f)
                horizontalLineTo(17f)
                curveTo(16.95f, 6.89f, 16.25f, 6.75f, 16.25f, 6.75f)
                curveTo(16.25f, 3.86f, 14f, 3f, 14f, 3f)
                verticalLineTo(5.5f)
                horizontalLineTo(13f)
                verticalLineTo(2.5f)
                curveTo(13f, 2.21f, 12.81f, 2f, 12.5f, 2f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()

        return _AccountHardHat!!
    }

@Suppress("ObjectPropertyName")
private var _AccountHardHat: ImageVector? = null

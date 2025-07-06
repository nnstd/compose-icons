package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeAccount: ImageVector
    get() {
        if (_HomeAccount != null) {
            return _HomeAccount!!
        }
        _HomeAccount = ImageVector.Builder(
            name = "HomeAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                moveTo(12f, 8.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 11f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.75f, 11f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8.75f)
                moveTo(12f, 15f)
                curveTo(13.5f, 15f, 16.5f, 15.75f, 16.5f, 17.25f)
                verticalLineTo(18f)
                horizontalLineTo(7.5f)
                verticalLineTo(17.25f)
                curveTo(7.5f, 15.75f, 10.5f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _HomeAccount!!
    }

@Suppress("ObjectPropertyName")
private var _HomeAccount: ImageVector? = null

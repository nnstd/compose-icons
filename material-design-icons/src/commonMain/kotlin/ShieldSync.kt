package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldSync: ImageVector
    get() {
        if (_ShieldSync != null) {
            return _ShieldSync!!
        }
        _ShieldSync = ImageVector.Builder(
            name = "ShieldSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                arcTo(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.87f, 12.67f)
                arcTo(11.63f, 11.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.55f, 6.84f, 21.74f, 12f, 23f)
                curveTo(12.35f, 22.91f, 12.7f, 22.8f, 13f, 22.68f)
                arcTo(6.42f, 6.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 18.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                moveTo(18f, 14.5f)
                verticalLineTo(13f)
                lineTo(15.75f, 15.25f)
                lineTo(18f, 17.5f)
                verticalLineTo(16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.24f, 19.62f)
                lineTo(21.33f, 20.71f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14.5f)
                moveTo(18f, 21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.76f, 17.38f)
                lineTo(14.67f, 16.29f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 22.5f)
                verticalLineTo(24f)
                lineTo(20.25f, 21.75f)
                lineTo(18f, 19.5f)
                close()
            }
        }.build()

        return _ShieldSync!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSync: ImageVector? = null

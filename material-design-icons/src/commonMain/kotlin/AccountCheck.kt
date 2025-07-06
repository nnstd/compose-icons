package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCheck: ImageVector
    get() {
        if (_AccountCheck != null) {
            return _AccountCheck!!
        }
        _AccountCheck = ImageVector.Builder(
            name = "AccountCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.1f, 12.5f)
                lineTo(22.5f, 13.91f)
                lineTo(15.97f, 20.5f)
                lineTo(12.5f, 17f)
                lineTo(13.9f, 15.59f)
                lineTo(15.97f, 17.67f)
                lineTo(21.1f, 12.5f)
                moveTo(10f, 17f)
                lineTo(13f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                curveTo(3f, 15.79f, 6.58f, 14f, 11f, 14f)
                lineTo(12.89f, 14.11f)
                lineTo(10f, 17f)
                moveTo(11f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4f)
                close()
            }
        }.build()

        return _AccountCheck!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCheck: ImageVector? = null

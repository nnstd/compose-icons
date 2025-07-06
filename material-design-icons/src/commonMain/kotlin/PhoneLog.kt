package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneLog: ImageVector
    get() {
        if (_PhoneLog != null) {
            return _PhoneLog!!
        }
        _PhoneLog = ImageVector.Builder(
            name = "PhoneLog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16.5f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                horizontalLineTo(7.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 4f)
                curveTo(8.5f, 5.24f, 8.7f, 6.45f, 9.07f, 7.57f)
                curveTo(9.18f, 7.92f, 9.1f, 8.31f, 8.82f, 8.58f)
                lineTo(6.62f, 10.79f)
                curveTo(8.06f, 13.62f, 10.38f, 15.94f, 13.21f, 17.38f)
                lineTo(15.41f, 15.18f)
                curveTo(15.69f, 14.9f, 16.08f, 14.82f, 16.43f, 14.93f)
                curveTo(17.55f, 15.3f, 18.75f, 15.5f, 20f, 15.5f)
                moveTo(12f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                moveTo(15f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                moveTo(12f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                moveTo(15f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                moveTo(12f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                moveTo(15f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
            }
        }.build()

        return _PhoneLog!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneLog: ImageVector? = null
